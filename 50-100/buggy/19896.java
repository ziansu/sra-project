@java.lang.Override
public void init(final de.uni_freiburg.informatik.ultimate.core.model.models.ModelType modelType, final int currentModelIndex, final int numberOfModels) throws java.lang.Throwable {
    mWaitForMe = numberOfModels > 1;
    if ("de.uni_freiburg.informatik.ultimate.ltl2aut".equals(modelType.getCreator())) {
        mLogger.info("Executing ACSLObjectContainerObserver...");
        mListen = true;
    }else {
        mListen = false;
    }
}