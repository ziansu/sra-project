public static void main(java.lang.String[] args) {
    main.java.PlagiarismDetector plagiarismDetector = new main.java.PlagiarismDetector();
    main.java.PlagiarismService plagiarismService = new main.java.PlagiarismService();
    main.java.InputWrapper inputWrapper = plagiarismDetector.validateInput(args);
    double plagiarismRatio = plagiarismService.checkPlagiarism(inputWrapper);
    java.lang.System.out.println();
    java.lang.System.out.println("---------------------------------------------------------------------------------------------");
    java.lang.System.out.println((("Plagiarism Percentage is " + (plagiarismRatio * 100)) + " %"));
    java.lang.System.out.println("---------------------------------------------------------------------------------------------");
    java.lang.System.out.println();
}