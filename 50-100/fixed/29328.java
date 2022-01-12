@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);
    binding = android.databinding.DataBindingUtil.inflate(inflater, R.layout.fragment_message_send, container, false);
    setupTextListener();
    return binding.getRoot();
}