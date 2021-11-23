private java.lang.String removeSpaces(java.lang.String s) {
    java.lang.String answer = "";
    for (int i = 0; i < (s.length()); i++)
        if ((s.charAt(i)) != ' ')
            answer += answer.charAt(i);
        
    
    return answer;
}