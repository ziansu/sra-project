public void add(uk.ac.cam.cl.depnn.embeddings.Embeddings embeddings, int i, boolean words) {
    precomputesList[i] = new uk.ac.cam.cl.depnn.embeddings.Precomputes(embeddings, network.getMatrix(i, W2V_LAYER_SIZE), words);
}