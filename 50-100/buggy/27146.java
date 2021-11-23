public marmot.segmenter.Segmenter train(java.util.Collection<marmot.segmenter.Word> words) {
    marmot.segmenter.SegmenterModel model = new marmot.segmenter.SegmenterModel();
    model.init(lang_, words, max_character_window_, use_segment_context_, use_character_feature_, dictionary_paths_);
    if (crf_mode_) {
        java.lang.System.err.println("Training CRF");
        run_crf(model, words);
    }else
        java.lang.System.err.println("Training Perceptron");
    
    run_perceptron(model, words);
    model.setFinal();
    marmot.segmenter.Segmenter segmenter = new marmot.segmenter.Segmenter(model);
    return segmenter;
}