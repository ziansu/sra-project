public boolean isRecur(dibattista.tyler.coop.ffnet.Neuron potIn, dibattista.tyler.coop.ffnet.Neuron potOut, int thresh) {
    (count)++;
    if ((count) > thresh) {
        return false;
    }
    if (potIn == potOut) {
        return true;
    }else {
        for (dibattista.tyler.coop.ffnet.Connection c : potIn.connections) {
            if (!(c.isRecurrent)) {
                if (isRecur(c.in, potOut, thresh))
                    return true;
                
            }
        }
    }
}