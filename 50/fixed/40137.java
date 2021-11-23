@java.lang.Override
public boolean run(ru.stqa.selenium.legrc.runner.RunContext ctx) {
    stepResult = step.run(ctx);
    result = (stepResult) && (afterStep(ctx));
    return result;
}