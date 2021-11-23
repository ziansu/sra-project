private org.tensorflow.Tensor getTensor(java.lang.String outputName) {
    int i = 0;
    for (java.lang.String n : fetchNames) {
        if (n == outputName) {
            return fetchTensors.get(i);
        }
        i++;
    }
    return null;
}