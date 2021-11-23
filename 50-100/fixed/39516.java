@java.lang.Override
public void onContext(@javax.annotation.Nonnull
final android.content.Context context) {
    super.onContext(context);
    try {
        mRoutine = com.gh.bmd.jrt.android.routine.JRoutine.on(mFactoryConstructor.newInstance(mArgs).create(context)).withShareGroup(mShareGroup).method(mMethodName, mParameterTypes);
    } catch (final com.gh.bmd.jrt.common.InvocationException e) {
        throw e;
    } catch (final java.lang.Throwable e) {
        throw new com.gh.bmd.jrt.common.InvocationException(e);
    }
}