public void respond(zutil.network.http.HttpPrintStream out, java.util.HashMap<java.lang.String, java.lang.String> client_info, java.util.HashMap<java.lang.String, java.lang.Object> session, java.util.HashMap<java.lang.String, java.lang.String> cookie, java.util.HashMap<java.lang.String, java.lang.String> request) {
    if (!(session.containsKey("file1"))) {
        out.println(("</html>" + (((((("	<form enctype='multipart/form-data' method='post'>" + "		<p>Please specify a file, or a set of files:<br>") + "		<input type='file' name='datafile' size='40'>") + "		</p>") + "		<input type='submit' value='Send'>") + "	</form>") + "</html>")));
    }
}