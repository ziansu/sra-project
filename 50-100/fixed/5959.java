public void startCLI() {
    Println(plainsimple.geometrytoolkit.CLI.msg.program_full_name());
    java.lang.String user_input;
    do {
        user_input = getInput();
        if (user_input.isEmpty()) {
            Println(plainsimple.geometrytoolkit.CLI.msg.no_input());
        }else {
            processInput(user_input);
        }
    } while (!(java.util.Objects.equals(user_input, "exit")) );
}