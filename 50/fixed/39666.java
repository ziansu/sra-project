public java.util.ArrayList<dataModel.AnnotationGeneral> RunGeneral() {
    java.util.ArrayList<dataModel.AnnotationGeneral> ann_gen = new java.util.ArrayList<dataModel.AnnotationGeneral>();
    ann_gen = this.Document.CreateGeneral();
    return ann_gen;
}