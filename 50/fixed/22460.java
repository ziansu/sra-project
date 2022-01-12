@org.junit.Test
public void correctMonoNeuron() {
    com.vgalloy.neuron.neuron.Neuron neuron = com.vgalloy.neuron.neuron.Neurons.of(java.util.Collections.singletonList(1L));
    java.lang.Boolean result = neuron.apply(java.util.Collections.singletonList(true));
    org.junit.Assert.assertFalse(result);
}