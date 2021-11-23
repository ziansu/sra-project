@org.springframework.shell.core.annotation.CliCommand(value = "list", help = "Display the Chemistry test data in the cluster")
public java.lang.String list() {
    java.util.Map<java.lang.String, java.util.Set<java.lang.Integer>> elements = this.chemistyService.neutrons();
    java.lang.String result = elements.entrySet().stream().map(java.lang.Object::toString).collect(java.util.stream.Collectors.joining(", ", "[", "]"));
    return result;
}