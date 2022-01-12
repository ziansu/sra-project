public void abilities() {
    if (direction.ability) {
        switch (ability.name) {
            case "superjump" :
                if (onGround) {
                    ability.active = true;
                    jump(2.0);
                    animationIndex = ability.animationIndex;
                    spriteIndex = 0;
                }
                break;
            default :
                {
                    if (!(ability.active)) {
                        animationIndex = ability.animationIndex;
                        spriteIndex = 0;
                        ability.active = true;
                    }
                }
        }
    }
}