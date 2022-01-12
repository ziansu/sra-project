public void setVariables(java.util.Map<java.lang.Integer, java.lang.Object> data) {
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Object> entry : data.entrySet()) {
        binding.setVariable(entry.getKey(), entry.getValue());
    }
    binding.executePendingBindings();
}