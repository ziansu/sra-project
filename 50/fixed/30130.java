@java.lang.Override
public ContainerService.Definition attach() {
    this.parent().attachAgentPoolProfile(this);
    return this.parent();
}