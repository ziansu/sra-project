public void setNetForce(nbody.Planet[] planets) {
    xNetForce = 0;
    yNetForce = 0;
    for (nbody.Planet planet : planets) {
        if (((planet.x) == (this.x)) && ((planet.y) == (this.y))) {
            return ;
        }else {
            xNetForce += calcPairwiseForceX(planet);
            yNetForce += calcPairwiseForceY(planet);
        }
    }
}