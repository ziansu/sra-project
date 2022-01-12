protected void onPostExecute(java.lang.String result) {
    if (result.contains("ERROR")) {
    }else {
        result = result.substring(1, ((result.length()) - 1));
        result = result.replace("\"", "");
        for (java.lang.String res : result.split(",")) {
            MainActivity.list.add(res);
        }
    }
}