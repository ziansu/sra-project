@java.lang.Override
public boolean run(ru.stqa.selenium.legrc.runner.RunContext ctx) {
    stepResult = step.run(ctx);
    stepResult = (afterStep(ctx)) && (stepResult);
    return stepResult;
}