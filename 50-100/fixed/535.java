public void setResult(final org.deidentifier.arx.ARXResult result) {
    this.result = result;
    if ((result != null) && ((result.getGlobalOptimum()) != null)) {
        optimalNodeAsString = java.util.Arrays.toString(result.getGlobalOptimum().getTransformation());
    }else {
        optimalNodeAsString = null;
    }
    setModified();
}