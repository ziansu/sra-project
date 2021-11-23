@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    com.fred.inventory.databinding.ItemBinding binding = android.databinding.DataBindingUtil.inflate(inflater, R.layout.item, container, false);
    com.fred.inventory.MainActivity.scoped(new com.fred.inventory.presentation.items.modules.ItemViewModule()).inject(this);
    binding.setViewModel(viewModel);
    binding.executePendingBindings();
    return binding.getRoot();
}