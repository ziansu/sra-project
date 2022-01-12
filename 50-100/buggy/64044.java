public void check_files_exist() {
    java.lang.String error_yes_no = "0";
    error_yes_no = read_stuff("my_stats.txt");
    if (error_yes_no == "error") {
        save_stuff("my_stats.txt", "1");
    }
    error_yes_no = read_stuff("time_interval.txt");
    if (error_yes_no == "error") {
        save_stuff("time_interval.txt", "1");
    }
    error_yes_no = read_stuff("power_challenge_list.txt");
    if (error_yes_no == "error") {
        save_stuff("power_challenge_list.txt", "1");
    }
}