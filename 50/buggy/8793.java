@java.lang.Override
public boolean isSatisfied() {
    return (getActivity().getTabModelSelector().getTotalTabCount()) == 2;
}