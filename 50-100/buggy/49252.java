@java.lang.Override
public int compareTo(com.ansj.vec.domain.Neuron neuron) {
    if ((this.category) == (neuron.category)) {
        if ((this.freq) > (neuron.freq)) {
            return 1;
        }else {
            return -1;
        }
    }else
        if ((this.category) > (neuron.category)) {
            return 1;
        }else {
            return 0;
        }
    
}