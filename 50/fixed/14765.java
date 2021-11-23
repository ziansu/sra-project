@org.jetbrains.annotations.NotNull
public static javax.swing.Timer createNamedTimer(@org.jetbrains.annotations.NonNls
@org.jetbrains.annotations.NotNull
final java.lang.String name, int delay) {
    return new javax.swing.Timer(delay, null) {
        @java.lang.Override
        public java.lang.String toString() {
            return name;
        }
    };
}