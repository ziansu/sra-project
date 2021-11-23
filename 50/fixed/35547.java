@java.lang.Override
public void start() {
    this.input = new com.narvis.frontend.console.input.Input();
    this.output = new com.narvis.frontend.console.output.Output(this);
    this.input.start();
}