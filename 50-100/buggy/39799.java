@java.lang.Override
public void setFeatureOrderList(java.util.List<java.lang.String> featureOrderList) {
    final java.util.Set<java.lang.String> basicSet = de.ovgu.featureide.fm.core.functional.Functional.mapToStringSet(de.ovgu.featureide.fm.core.functional.Functional.filter(new de.ovgu.featureide.fm.core.base.impl.FeaturePreOrderIterator(this), new de.ovgu.featureide.fm.core.filter.ConcreteFeatureFilter()));
    basicSet.removeAll(featureOrderList);
    featureOrderList.clear();
    featureOrderList.addAll(featureOrderList);
    featureOrderList.addAll(basicSet);
}