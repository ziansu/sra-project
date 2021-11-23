private void runIntent() {
    if (networkOk) {
        android.content.Intent intent = new android.content.Intent(this, com.kumar.shirtstore.service.MyService.class);
        intent.setData(android.net.Uri.parse(com.kumar.shirtstore.JSON_URL));
        startService(intent);
    }else {
        android.widget.Toast.makeText(this, "Network not available", Toast.LENGTH_SHORT).show();
    }
}