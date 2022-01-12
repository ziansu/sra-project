public static boolean addSlide(com.comp.iitb.vialogue.models.ParseObjects.models.Slide slide) throws java.lang.Exception {
    com.comp.iitb.vialogue.coordinators.SharedRuntimeContent.project.addSlide(slide);
    slide.pinInBackground();
    com.comp.iitb.vialogue.coordinators.SharedRuntimeContent.project.pinInBackground();
    com.comp.iitb.vialogue.coordinators.SharedRuntimeContent.projectAdapter.notifyItemInserted(((com.comp.iitb.vialogue.coordinators.SharedRuntimeContent.project.getSlides().size()) - 1));
    com.comp.iitb.vialogue.coordinators.SharedRuntimeContent.calculatePreviewFabVisibility();
    return true;
}