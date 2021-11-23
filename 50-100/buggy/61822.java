public void save() {
    M m = io.jpress.core.JBaseCRUDController.getModel(mClazz);
    if (io.jpress.core.JBaseCRUDController.isMultipartRequest()) {
        io.jpress.core.JBaseCRUDController.getFile();
    }
    if (!(onModelSaveBefore(m))) {
        io.jpress.core.JBaseCRUDController.renderAjaxResultForError();
        return ;
    }
    m.saveOrUpdate();
    if (!(onModelSaveAfter(m))) {
        io.jpress.core.JBaseCRUDController.renderAjaxResultForError();
        return ;
    }
    io.jpress.core.JBaseCRUDController.renderAjaxResultForSuccess("ok");
}