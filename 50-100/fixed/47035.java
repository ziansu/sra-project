@java.lang.Override
protected void applyStatus(de.dreier.mytargets.shared.base.fragment.ETimerState status) {
    binding.getRoot().setBackgroundResource(status.color);
    if (de.dreier.mytargets.utils.Utils.isLollipop()) {
        android.view.Window window = getActivity().getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getActivity().getResources().getColor(status.color));
    }
    binding.timerStatus.setText(getStatusText(status));
    if (status == (de.dreier.mytargets.shared.base.fragment.ETimerState.FINISHED)) {
        binding.timerStatus.setText("");
    }
}