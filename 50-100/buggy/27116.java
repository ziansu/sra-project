private void scanSeparator() {
    switch (currentChar) {
        case '/' :
            char nextChar = sourceFile.getSource();
            if (nextChar == '/') {
                takeIt();
                takeIt();
                while ((currentChar) != '\n')
                    takeIt();
                
                takeIt();
            }
            break;
        case ' ' :
        case '\n' :
        case '\r' :
        case '\t' :
            takeIt();
            break;
    }
}