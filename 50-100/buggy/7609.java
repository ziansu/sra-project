private void display_responds(java.lang.String s) {
    switch (s) {
        case "text" :
            instruction.setText(hints[counter]);
            break;
        case "audio" :
            break;
        case "flash" :
            break;
        case "show" :
            show(counter);
            break;
        case "next" :
            show(counter);
            (counter)++;
            instruction.setText(instructions[counter]);
            step_number.setText(steps[counter]);
            break;
    }
}