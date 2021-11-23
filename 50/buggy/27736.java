public void read_data() {
    fi.aalto.drumbeat.drumbeat_tree.DrumbeatTree.vo.DrumbeatAnnotationsData da = internal_read_data();
    data_store = java.util.Optional.of(da);
    if (da == null)
        data_store = java.util.Optional.of(new fi.aalto.drumbeat.drumbeat_tree.DrumbeatTree.vo.DrumbeatAnnotationsData());
    
}