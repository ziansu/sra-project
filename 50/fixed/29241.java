@org.junit.Before
public void instantiateFeature() {
    this.feature = new br.com.algorithms.machine.learning.supervisioned.tree.id3.data.feature.FeatureImpl("Feature");
    this.feature.addNewValue("Value1");
    this.feature.addNewValue("Value2");
}