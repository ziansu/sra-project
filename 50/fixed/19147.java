public static void autocomplete(java.lang.String apiKey, java.lang.String extraQuery, java.lang.String input, com.github.stephenbaidu.placepicker.AutocompleteTask.OnTaskCompleted onTaskCompleted) {
    com.github.stephenbaidu.placepicker.AutocompleteTask autocompleteTask = new com.github.stephenbaidu.placepicker.AutocompleteTask(apiKey, extraQuery);
    autocompleteTask.setOnTaskCompleted(onTaskCompleted);
    autocompleteTask.execute(input);
}