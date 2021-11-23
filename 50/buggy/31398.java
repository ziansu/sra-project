public boolean isCancelStatus() {
    return StatusCode.CANCELED_CODE.endsWith(mRequest.getStatus());
}