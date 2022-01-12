private java.lang.String validateDuration(java.lang.String durationString) {
    while (true) {
        java.lang.String durationFormat = "HH:mm:ss";
        java.text.DateFormat DurationFormat = new java.text.SimpleDateFormat(durationFormat);
        try {
            DurationFormat.parse(durationString);
            return durationString;
        } catch (java.text.ParseException e) {
            java.lang.System.out.println("Wrong format");
            java.lang.System.out.print("Choose duration(hh:mm:ss): ");
            durationString = scanner.nextLine();
        }
    } 
}