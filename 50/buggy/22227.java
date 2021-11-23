@java.lang.Override
public boolean performFinish() {
    de.ovgu.featureide.fm.core.explanations.Redundancy.setNewModel(oldFm);
    FeatureModelAnalyzer.deadFeatureExpl.clear();
    FeatureModelAnalyzer.falseOptFeatureExpl.clear();
    FeatureModelAnalyzer.redundantConstrExpl.clear();
    return true;
}