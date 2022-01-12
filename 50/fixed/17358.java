@org.springframework.shell.core.annotation.CliCommand(value = "load", help = "Insert Chemistry test data into the cluster")
public java.lang.String load() {
    int count = this.chemistyService.load();
    return java.lang.String.format("[%d row%s]", count, (count != 1 ? "s" : ""));
}