void releaseUnsafe() throws java.lang.Exception {
    if ((filter_graph) != null) {
        org.bytedeco.javacpp.avfilter.avfilter_graph_free(filter_graph);
        buffersink_ctx = null;
        buffersrc_ctx = null;
        filter_graph = null;
    }
    if ((image_frame) != null) {
        org.bytedeco.javacpp.avutil.av_frame_free(image_frame);
        image_frame = null;
    }
    if ((filt_frame) != null) {
        org.bytedeco.javacpp.avutil.av_frame_free(filt_frame);
        filt_frame = null;
    }
    frame = null;
}