@org.rstudio.core.client.command.Handler
void onProfileCode() {
    codeExecution_.executeSelection(true, true, "profvis::profvis", true);
}