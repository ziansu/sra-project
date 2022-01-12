public void createViewModel() {
    checkViewBindung();
    if ((viewModel) == null) {
        viewModel = raclette.getViewModelManager().createViewModel(viewModelBindingConfig.getViewModelClass());
        viewModel.setNavigationController(raclette.createNavigationController());
        getNavigationControllerImpl().setContext(context);
        setNavigationSupportIfNeeded();
        injectParams();
        binding.setVariable(raclette.getViewModelBindingId(), viewModel);
        viewModel.viewModelCreate(params);
        callback.onCreated();
    }
}