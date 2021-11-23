public void setup() {
    if (false) {
        set_input_folder("N:\\pipeline\\inputs");
        set_watch_folder("N:\\pipeline\\enhanced3");
    }else {
        java.lang.String working_directory = new java.io.File(".").getAbsolutePath();
        working_directory = working_directory.substring(0, ((working_directory.length()) - 1));
        set_input_folder((working_directory + "_input"));
        set_watch_folder((working_directory + "_watch"));
        empty_folder(input_folder);
        empty_folder(watch_folder);
    }
}