@java.lang.Override
public void setSootOptions(soot.options.Options options) {
    soot.options.Options.v().set_exclude(java.util.Collections.singletonList("soot.jimple.infoflow.test.methodSummary.GapClass"));
}