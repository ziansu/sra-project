@java.lang.Override
public void onContext(@javax.annotation.Nonnull
final android.content.Context context) {
    super.onContext(context);
    try {
        mRoutine = com.gh.bmd.jrt.android.routine.JRoutine.on(mFactoryConstructor.newInstance(mArgs).create(context)).withShareGroup(mShareGroup).method(mMethodName, mParameterTypes);
    } catch (final java.lang.InstantiationException e) {
        throw new com.gh.bmd.jrt.common.InvocationException(e);
    } catch (final java.lang.reflect.InvocationTargetException e) {
        throw new com.gh.bmd.jrt.common.InvocationException(e);
    } catch (final java.lang.IllegalAccessException e) {
        throw new com.gh.bmd.jrt.common.InvocationException(e);
    }
}