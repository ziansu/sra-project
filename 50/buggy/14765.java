@org.jetbrains.annotations.NotNull
public static javax.swing.Timer createNamedTimer(@org.jetbrains.annotations.NonNls
@org.jetbrains.annotations.NotNull
final java.lang.String name, int delay, @org.jetbrains.annotations.NotNull
java.awt.event.ActionListener listener) {
    return new javax.swing.Timer(delay, listener) {
        @java.lang.Override
        public java.lang.String toString() {
            return name;
        }
    };
}