@org.rstudio.core.client.command.Handler
void onProfileCodeWithoutFocus() {
    codeExecution_.executeSelection(false, false, "profvis::profvis");
}