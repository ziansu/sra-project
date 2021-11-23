@javax.annotation.Nonnull
public java.lang.String readString() {
    try (java.util.Scanner scanner = scanner()) {
        return scanner.nextLine();
    }
}