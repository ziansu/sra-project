int animationStringToInt(java.lang.String animation) {
    switch (animation) {
        case "No animation" :
            return org.myrobotlab.service.NeoPixel.NEOPIXEL_ANIMATION_NO_ANIMATION;
        case "Stop" :
            return org.myrobotlab.service.NeoPixel.NEOPIXEL_ANIMATION_STOP;
        case "Color Wipe" :
            return org.myrobotlab.service.NeoPixel.NEOPIXEL_ANIMATION_COLOR_WIPE;
        case "Larson Scanner" :
            return org.myrobotlab.service.NeoPixel.NEOPIXEL_ANIMATION_LARSON_SCANNER;
        case "Theater Chase" :
            return org.myrobotlab.service.NeoPixel.NEOPIXEL_ANIMATION_THEATER_CHASE;
        case "Theater Chase Rainbow" :
            return org.myrobotlab.service.NeoPixel.NEOPIXEL_ANIMATION_THEATER_CHASE_RAINBOW;
        case "Rainbow" :
            return org.myrobotlab.service.NeoPixel.NEOPIXEL_ANIMATION_RAINBOW;
        case "Rainbow Cycle" :
            return org.myrobotlab.service.NeoPixel.NEOPIXEL_ANIMATION_RAINBOW_CYCLE;
        case "Flash Random" :
            return org.myrobotlab.service.NeoPixel.NEOPIXEL_ANIMATION_FLASH_RANDOM;
        case "Ironman" :
            return org.myrobotlab.service.NeoPixel.NEOPIXEL_ANIMATION_IRONMAN;
        default :
            org.myrobotlab.service.NeoPixel.log.error("Unknow Animation type {}", animation);
            return org.myrobotlab.service.NeoPixel.NEOPIXEL_ANIMATION_STOP;
    }
}