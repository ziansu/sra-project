@java.lang.Override
public java.lang.String toString() {
    java.lang.String sizeString = "";
    switch (size) {
        case SMALL :
            sizeString = "Small";
            break;
        case MEDIUM :
            sizeString = "Medium";
            break;
        case LARGE :
            sizeString = "Large";
            break;
    }
    java.lang.String airplaneString = "";
    airplaneString += ("Name: " + (name)) + "\n";
    airplaneString += ("Priority: " + (priority)) + "\n";
    airplaneString += ("Size: " + sizeString) + "\n";
    return airplaneString;
}