private void showLoading(boolean b) {
    if (b) {
        binding.load.setVisibility(View.VISIBLE);
        binding.contentWrapper.setVisibility(View.GONE);
    }else {
        binding.load.setVisibility(View.GONE);
        binding.contentWrapper.setVisibility(View.VISIBLE);
    }
}