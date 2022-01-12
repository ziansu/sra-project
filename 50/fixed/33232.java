@java.lang.Override
public void setIn(org.jala.efeeder.api.command.In parameters) {
    this.parameters = parameters;
    this.inUtils = new org.jala.efeeder.util.InUtils(parameters);
}