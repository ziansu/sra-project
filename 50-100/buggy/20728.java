public void animateSwap(wrapper.datastructures.Element var1, application.visualization.render2d.Render var1_rndr, wrapper.datastructures.Element var2, application.visualization.render2d.Render var2_rndr) {
    var1_rndr.animate(var2, var1_rndr.absX(var1), var1_rndr.absY(var1), var2_rndr.absX(var2), var2_rndr.absY(var2));
}