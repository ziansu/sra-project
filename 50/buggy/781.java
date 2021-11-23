public static Model.WorkSpace getInstance() {
    if (null == (Model.WorkSpace.instance)) {
        Model.WorkSpace.instance = new Model.WorkSpace();
        Model.WorkSpace.logger = new our.Utils.Logger(true);
    }
    return Model.WorkSpace.instance;
}