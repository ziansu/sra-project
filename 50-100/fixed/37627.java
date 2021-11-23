@java.lang.Override
@org.jetbrains.annotations.NotNull
public javafx.collections.ObservableList<java.nio.file.Path> fromString(@org.jetbrains.annotations.Nullable
java.lang.String string) {
    return (string != null) && (!(string.isEmpty())) ? javafx.collections.FXCollections.observableList(java.util.Arrays.stream(string.split(";")).map(( path) -> java.nio.file.Paths.get(path)).collect(java.util.stream.Collectors.toList())) : javafx.collections.FXCollections.observableArrayList();
}